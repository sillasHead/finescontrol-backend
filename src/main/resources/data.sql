insert into car (plate,brand,color,renavam) values
('AAA1111','IVECO','BRANCO','123456789'),
('BBB2222','MERCEDES','BRANCO','123456789'),
('CCC3333','FOTON','VERDE','123456789'),
('DDD4444','DELIVERY','AZUL','123456789'),
('EEE5555','PEUGEOT','BRANCO','123456789');

insert into driver (name, status) values
('KENNEDY', true),
('ADILSON', true),
('EDSON', true),
('CLAUDIO', true),
('CARLOS VAGNER', true),
('MARCIO', false);

insert into infraction (description,amount,type) values
('velocidade',130.16,'media'),
('faixa',260.32,'grave'),
('celular',390.48,'gravissima');

insert into fine (ait_code,moment,due_date,payment_date,identified_driver,amount,car_id,driver_id,infraction_id) values
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,1,1,1),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,2,2,2),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,3,3,3);
