INSERT INTO items(id, name, stock, price)
VALUES (100, '돗자리', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (101, '캠핑 박스', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (102, '램프', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (103, '알전구', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (104, '블루투스 스피커', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (105, '테이블보', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (106, '담요', 3, 0);
INSERT INTO items(id, name, stock, price)
VALUES (107, '종량제 10L', 30, 0);
INSERT INTO items(id, name, stock, price)
VALUES (108, '파우치', 3, 0);

INSERT INTO items(id, name, stock, price)
VALUES (200, '종이컵', 300, 100);
INSERT INTO items(id, name, stock, price)
VALUES (201, '일회용 접시', 300, 140);
INSERT INTO items(id, name, stock, price)
VALUES (202, '일회용 젓가락', 300, 50);
INSERT INTO items(id, name, stock, price)
VALUES (203, '물티슈 (0매입)', 300, 1000);
INSERT INTO items(id, name, stock, price)
VALUES (204, '위생 장갑', 300, 100);
INSERT INTO items(id, name, stock, price)
VALUES (205, '티슈', 300, 500);


INSERT INTO dozzaris(id, name)
VALUES ('dozzari1', '도짜리 1호');
INSERT INTO dozzaris(id, name)
VALUES ('dozzari2', '도짜리 2호');
INSERT INTO dozzaris(id, name)
VALUES ('dozzari3', '도짜리 3호');

INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 100, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 101, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 102, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 103, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 104, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 105, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 106, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 107, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari1', 108, 1);

INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 100, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 101, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 102, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 103, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 104, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 105, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 106, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 107, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari2', 108, 1);

INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 100, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 101, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 102, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 103, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 104, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 105, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 106, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 107, 1);
INSERT INTO dozzari_items(dozzari_id, item_id, quantity)
VALUES ('dozzari3', 108, 1);

INSERT INTO available_dates(date)
VALUES ('2024-10-07');
INSERT INTO available_dates(date)
VALUES ('2024-10-08');
INSERT INTO available_dates(date)
VALUES ('2024-10-09');
INSERT INTO available_dates(date)
VALUES ('2024-10-10');
INSERT INTO available_dates(date)
VALUES ('2024-10-11');
INSERT INTO available_dates(date)
VALUES ('2024-10-12');
INSERT INTO available_dates(date)
VALUES ('2024-10-13');

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-07', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-07', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-07', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-08', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-08', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-08', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-09', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-09', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-09', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-10', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-10', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-10', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-11', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-11', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-11', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-12', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-12', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-12', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari1', '2024-10-13', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari2', '2024-10-13', '22:00', FALSE);

INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '10:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '10:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '11:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '11:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '12:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '12:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '13:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '13:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '14:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '14:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '15:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '15:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '16:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '16:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '17:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '17:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '18:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '18:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '19:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '19:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '20:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '20:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '21:00', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '21:30', FALSE);
INSERT INTO available_times(dozzari_id, date, time, is_booked)
VALUES ('dozzari3', '2024-10-13', '22:00', FALSE);

