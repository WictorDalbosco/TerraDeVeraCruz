CREATE database TerraDeVeraCruz;

USE TerraDeVeraCruz;

CREATE table Npc(
	idNpc int not null,
    nomeNpc varchar(50),
    idInvent int,
	hpNpc int,
    nivel int,
    forcaNpc int,
    tipo varchar(20),
	primary key(idNpc)
)engine innodb;

CREATE table Jogador(
    save int,
    nome varchar(50),
	hp int,
	dinheiro decimal(10,2),
	xp int,
	checkpoint int,
    idNpc int not null,
	primary key (save),
	foreign key (idNpc) references Npc(idNpc)
)engine innodb;

CREATE table Slot (
	cod char(3),
    idInvent int,
    save int,
    idNpc int,
    primary key (cod),
    foreign key(save) references Jogador(save),
    foreign key(idNpc) references Npc(idNpc)
)engine innoDB;


CREATE table Item(
	id char(5),
    nome varchar(50),
    valorCompra double,
    valorVenda double,
    cod char(3),
    primary key (id),
    foreign key (cod) references Slot(cod)
)engine innoDB;


CREATE table ItemArma(
	id char(5),
    forcaArma int,
    materialArma varchar(50),
    foreign key (id) references Item(id),
    primary key (id)
)engine innoDB;


CREATE table ItemVestimenta(
	id char(5) not null,
    protecao int,
    materialVest varchar(50),
    foreign key (id) references Item(id),
    primary key (id)
)engine innoDB;

CREATE table ItemConsumivel(
	id char(5),
    alcool boolean,
    hpRec int,
    foreign key (id) references Item(id),
    primary key (id)
)engine innoDB;



CREATE table Habilidade(
	idHabil int,
    nomeHabil varchar(50),
    nivelHabil int,
    save int,
    primary key(idHabil),
    foreign key(save) references Personagem(save)
)engine innoDB;

insert into Npc(idNpc,nomeNpc,hpNpc,nivel,forca,tipo)
	values(1,"Pedro",30,2,0,"comerciante"),
		  (2,"Bernardo",32,1,0,"comerciante"),
          (3,"Anhangabaú",90,2,22,"hostil"),
          (4,"Kaiowa",100,3,40,"hostil"),
          (5,"Jerônimo",12,1,10,"hostil"),
          (6,"Rodrigo",60,5,15,"hostil"),
          (7,"Anchieta",80,7,30,"comerciante"),
          (8,"Iracema",100,8,50,"amigavel"),
          (9,"Irapua",100,5,50,"hostil"),
          (10,"Martin",40,2,55,"comerciante"),
          (11,"Poti",80,4,0,"amigavel"),
          (12,"Lutero",60,3,0,"comerciante"),
          (13,"Pitagoras",30,4,0,"amigavel"),
          (14,"Westworld",40,4,13,"comerciante"),
          (15,"Dolores",60,2,90,"amigavel"),
          (16,"Adilson",50,3,32,"amigavel"),
          (17,"Aloy",60,3,60,"hostil"),
          (18,"Rost",70,2,65,"amigavel"),
          (19,"Joel",80,3,10,"hostil"),
          (20,"Geralt",150,10,134,"hostil");
          
insert into Personagem(save,nome,hp,dinheiro,xp,checkpoint,idNpc)
	values(1,"Vásquez de La Fonseca",100,0,0,15,1);

insert into Slot(cod,idInvent,save,idNpc)
	values("11",1,1,null),
		  ("12",1,1,null),
          ("13",1,1,null),
          ("14",1,1,null),
          ("15",1,1,null),
          ("21",2,null,1),
          ("22",2,null,1),
          ("23",2,null,1),
          ("24",2,null,1),
          ("25",2,null,1),
          ("31",3,null,2),
		  ("32",3,null,2),
          ("33",3,null,2),
          ("34",3,null,2),
          ("35",3,null,2),
          ("41",4,null,3),
		  ("42",4,null,3),
          ("43",4,null,3),
          ("44",4,null,3),
          ("45",4,null,3),
          ("51",5,null,4),
		  ("52",5,null,4),
          ("53",5,null,4),
          ("54",5,null,4),
          ("55",5,null,4),
          ("61",6,null,5),
		  ("62",6,null,5),
          ("63",6,null,5),
          ("64",6,null,5),
          ("65",6,null,5),
          ("71",7,null,6),
          ("72",7,null,6),
          ("73",7,null,6),
          ("74",7,null,6),
          ("75",7,null,6),
          ("81",8,null,7),
          ("82",8,null,7),
          ("83",8,null,7),
          ("84",8,null,7),
          ("85",8,null,7),
          ("91",9,null,8),
          ("92",9,null,8),
          ("93",9,null,8),
          ("94",9,null,8),
          ("95",9,null,8),
          ("101",10,null,9),
          ("102",10,null,9),
          ("103",10,null,9),
          ("104",10,null,9),
          ("105",10,null,9);

-- id começa: 1 arma, 2 vestimenta, 3 comida

--  cod começa: 1° numero do inventario, 2° numero do slot

insert into Item(id,nome,valorCompra,valorVenda,cod)
	values("11","Lança",100,75,"11"),
		  ("21","Cocar",15,20,"12"),
		  ("22","Batina",70,80,"13"),
		  ("31","Vinho",80,50,"14"),
          ("12","Cimitarra",200,130,"15"),
          ("32","Bacalhau",80,37,"21"),
		  ("33","Batata",10,4,"22"),
          ("218","Bota",32,80,"23"),
		  ("13","ArcoTupi",120,80,"24"),
          ("14","FlechaTupi",2,0,"25"),
          ("15","Mosquete",450,150,"31"),
		  ("16","Munição",50,20,"32"),
          ("34","Coco",5,0,"33"),
		  ("23","Calção",70,30,"34"),
          ("24","Chapéu",45,25,"35"),
          ("35","Mandioca",20,5,"41"),
          ("36","Tapioca",20,5,"42"),
          ("37","Canjica",25,5,"43"),
          ("38","Milho",40,15,"44"),
		  ("25","SapatoCouro",50,18,"45"),        
		  ("17","Machadinho",110,80,"51"),
          ("18","Zarabatana",120,50,"52"),
          ("19","Dardo",2,0,"53"),
		  ("26","Bota",15,3,"54"),
          ("39","Sardinha",12,4,"55"),
          ("310","PastelBelem",20,6,"61"),
          ("27","CalçaDeDamasco",120,75,"62"),
          ("28","Casaco",80,35,"63"),
          ("110","Tacape",55,20,"64"),
		  ("111","Adaga",100,40,"65"),
		  ("112","Arcabuz",130,80,"71"),       
   		  ("311","Broa",5,0,"72"),
		  ("29","JaquetaSobreTudo",100,30,"73"),
          ("210","BotaDeDamasco",100,70,"74"),
          ("211","Turbante",20,9,"75"),
          ("113","Mosquete",150,90,"81"),
          ("312","Acarajé",12,3,"82"),
          ("313","Queijo",20,9,"83"),
          ("212","ColarPerolas",300,500,"84"),
          ("314","Caranguejo",34,11,"85"),
          ("114","Machado",30,5,"91"),
          ("315","BolinhoBacalhau",8,2,"92"),
          ("213","SapatoSeda",30,12,"93"),
      	  ("316","Cozido",37,6,"94"),
		  ("214","Tunica",32,13,"95"),
          ("215","CamisaGibão",149,60,"101"),
          ("317","Alheira",30,13,"102"),
          ("216","SapatoVeludo",40,16,"103"),
   		  ("217","CalçaGibão",119,40,"104"),
       	  ("318","Risoto",53,4,"105");

insert into ItemArmas(id,forca,materialArmas)
	values("11",15,"Ferro"),
		  ("12",22,"Ferro"),
          ("13",25,"Madeira"),
          ("14",5,"Madeira"),
          ("15",50,"Ferro"),
          ("16",10 ,"Ferro"),
          ("17",25,"Madeira"),
          ("18",12,"Madeira"),
          ("19",3,"Madeira"),
          ("110",20,"Madeira"),
          ("111",35,"Ferro"),
          ("112",50,"Ferro"),
          ("113",50,"Ferro"),
          ("114",30,"Ferro");
          
insert into ItemVestimenta(id,protecao,materialVest)
	values("21",3,"Penas"),
		  ("22",10,"Algodão"),
          ("23",30,"Bronze"),
          ("24",5,"Lã"),
          ("25",5,"Couro"),
          ("26",5,"Couro"),
          ("27",8,"Couro"),
          ("28",25,"Bronze"),
          ("29",10,"Lã"),
          ("210",10,"Couro"),
          ("211",15,"Bronze"),
          ("212",3,"Pano"),
          ("213",20,"Perolas"),
          ("214",3,"Seda"),
          ("215",10,"Seda"),
          ("216",15,"Couro"),
          ("217",5,"Veludo");
          
insert into ItemConsumivel(id,alcool,hpRec)
	values("31",true,15),
		  ("32",false,20),
          ("33",false,8),
          ("34",false,5),
          ("35",false,10),
          ("36",false,8),
          ("37",false,5),
          ("38",false,12),
          ("39",false,15),
          ("310",false,15),
          ("311",false,2),
          ("312",false,5),
          ("313",false,5),
          ("314",false,8),
          ("315",false,5),
          ("316",false,10),
          ("317",false,10),
          ("318",false,8);
          
insert into Habilidade(idHabil,nomeHabil,nivelHabil,save)
	values(1,"Escalar",3,1),
		  (2,"Furtividade",5,1),
          (3,"Nadar",3,1),
          (4,"Barganhar",6,1),
          (5,"Cartografia",9,1),
          (6,"Lootear",1,1),
          (7,"Montar Cavalo",1,1),
          (8,"Desarmar",7,1),
          (9,"Falar Línguas",3,1),
          (10,"Domesticar Aves",1,1);

-- drop database TerraDeVeraCruz;
-- drop table ItemVestimenta;
