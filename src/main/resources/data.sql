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

insert into infraction (description,amount,type,rating) values
('Dirigir veículo segurando telefone celular',293.47,'gravíssima',7),
('Transitar em velocidade superior à máxima permitida em até 20%',130.16,'média',4),
('Usar qualquer veículo para, deliberadamente, perturbar a circulação na via sem autorização do orgão',5864.40,'auto-suspensiva',7);

insert into fine (ait_code,moment,due_date,payment_date,identified_driver,amount,car_id,driver_id,infraction_id) values
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,1,1,1),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,2,2,2),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,3,3,3);
