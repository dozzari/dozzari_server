package today.dozzari.server.util;

import org.springframework.stereotype.Component;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@Component
public class StringUtil {

    public String generateRandomId() {
        String uuid = UUID.randomUUID().toString();
        byte[] uuidBytes = uuid.getBytes();
        byte[] userIdBytes;

        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            userIdBytes = sha256.digest(uuidBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new BusinessException(ExceptionCode.FAILED_TO_CREATE_ID);
        }

        StringBuilder orderId = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            orderId.append(String.format("%02x", userIdBytes[i]));
        }

        return orderId.toString();
    }
}
