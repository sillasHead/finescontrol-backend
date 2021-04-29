insert into car (plate,brand,collor,renavam) values
('aaa1111','iveco','branco','123456789'),
('bbb2222','mercedes','branco','123456789'),
('ccc3333','foton','verde','123456789'),
('ddd4444','delivery','azul','123456789'),
('eee5555','peugeot','branco','123456789');

insert into driver (name) values
('kennedy'),
('adilson'),
('edson'),
('claudio'),
('carlos vagner');

insert into infraction (description,amount,type) values
('velocidade',130.16,'media'),
('faixa',260.32,'grave'),
('celular',390.48,'gravissima');

insert into fine (ait_code,moment,due_date,payment_date,identified_driver,amount,car_id,driver_id,infraction_id) values
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,1,1,1),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,2,2,2),
('a1b2',TIMESTAMP WITH TIME ZONE'2021-01-01T10:00:00Z','2021-02-01','2021-02-01',false,130.16,3,3,3);
