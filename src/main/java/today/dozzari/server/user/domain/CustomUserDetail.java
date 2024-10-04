package today.dozzari.server.user.domain;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import today.dozzari.server.user.entity.User;

import java.util.Collection;

@Getter
public class CustomUserDetail implements UserDetails {

    private final String userId;

    public CustomUserDetail(User user) {
        this.userId = user.getId();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getId() {
        return userId;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }
}
