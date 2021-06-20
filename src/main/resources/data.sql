insert into car (plate,name,renavam,status) values
('AAA1111','IVECO','123456789',true),
('BBB2222','MERCEDES','123456789',true),
('CCC3333','FOTON','123456789',true),
('DDD4444','DELIVERY','123456789',true),
('EEE5555','PEUGEOT','123456789',true);

insert into driver (name,status) values
('KENNEDY',true),
('ADILSON',true),
('EDSON',true),
('CLAUDIO',true),
('CARLOS VAGNER',true),
('MARCIO',false);

insert into infraction (description,amount,type) values
('velocidade',130.16,'media'),
('faixa',260.32,'grave'),
('celular',390.48,'gravissima');

insert into fine (ait_code,moment,due_date,payment_date,identified_driver,amount,car_id,driver_id,infraction_id) values
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,1,1,1),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,2,2,2),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,3,3,3);
