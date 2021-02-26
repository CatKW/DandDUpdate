CREATE DATABASE playerdb;
 USE playerdb;
drop table pclass;

drop table creature;
CREATE TABLE creature (
creature_id INT auto_increment PRIMARY KEY,
name VARCHAR(50) NOT NULL,
description VARCHAR(250) NOT NULL,
video VARCHAR(250)
);

select * from weapons;

insert into creature (name, description, video) values ('Fighter', 'A master of martial combat, skilled with a variety of weapons and armor.', 'https://www.youtube.com/embed/uz_39A6uYfw');
insert into creature (name, description, video) values ('Barbarian', 'A fierce warrior of primitive background who can enter a battle rage.', 'https://www.youtube.com/embed/BWT03-0qAj0');
insert into creature (name, description, video) values ('Ranger', 'A warrior who combats threats on the edges of civilization.', 'https://www.youtube.com/embed/ZQ2qEtygBRc');
insert into creature (name, description, video) values ('Rogue', 'A scroundrel who uses stealth and trickery to overcome obstacles and enemies.', 'https://www.youtube.com/embed/LALHl4FJUx0');
insert into creature (name, description, video) values ('Paladin', 'A holy warrior bound to a sacred oath.', 'https://www.youtube.com/embed/llPop59jOi8'); 
insert into creature (name, description, video) values ('Bard', 'An aspiring magician whose power echoes the music of creation.', 'https://www.youtube.com/embed/nniOeVTDoYc');
insert into creature (name, description, video) values ('Cleric', 'A priestly champion who wields divine magic in service of a higher power.', 'https://www.youtube.com/embed/J8K38UeKnWg');
insert into creature (name, description, video) values ('Druid', 'A priest of the Old Faith, wielding the powers of nature and adopting animal forms.', 'https://www.youtube.com/embed/a1_maa42Yfc');
insert into creature (name, description, video) values ('Monk', 'A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection.', 'https://www.youtube.com/embed/tRMj_PyXQ_A');
insert into creature (name, description, video) values ('Sorcerer', 'A spellcaster who draws on inherent magic from a gift or bloodline.', 'https://www.youtube.com/embed/Ikrg8kAAvZg');
insert into creature (name, description, video) values ('Warlock', 'A weilder of magic that is derived from a bargain with an extraplanar entity.', 'https://www.youtube.com/embed/ohYOpixzd_s');
insert into creature (name, description, video) values ('Wizard', 'A scholarly magic-user capable of manipulating the structures of reality.', 'https://www.youtube.com/embed/dgKzaIYwUhE');

SELECT * FROM creature;

drop table races;
CREATE TABLE races (
race_id INT auto_increment PRIMARY KEY,
name VARCHAR(50) NOT NULL, 
description VARCHAR(250) NOT NULL
);

insert into races (name, description) values ('Dwarf', 'Bold and hardy, dwarbes are known as skilled warriors, miners, and workers of stone and metal.');
insert into races  (name, description) values ('Elf', 'Elves are a magical people of otherworldy grace, living in the world but not entirely part of it.');
insert into races  (name, description) values ('Half-Elf', 'Half-elves combine what some say are the best qualities of their elf and human parents.');
insert into races (name, description) values ('Human', 'Humans are the most adaptable and ambitious people among the common races. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.');
insert into races (name, description) values ('Half-Orc', 'Half-orcs grayish pigmintations, sloping foreheads, jutting jaws, prominent teeth, and towering builds make their orcish heritage plain for all to see.');
insert into races (name, description) values ('Dragonborn', 'Dragonborn look very much like dragons standing erect in humanoid form, though they lack wings or a tail.');
insert into races (name, description) values ('Gnome','A gnomes energy and enthusiasm for living shines through every inch of his or her tiny body.');
insert into races (name, description) values ('Halfling', 'The diminutive halflings survive in a world full of larger creatures by avoiding notice or, barring that, avoiding offense.');
insert into races (name, description) values ('Tiefling', 'To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling.');

select * from races;

CREATE TABLE stats (
stats_id int auto_increment primary key,
strength int NOT NULL,
dexterity int NOT NULL,
constitution int NOT NULL, 
intelligence int NOT NULL,
wisdom int NOT NULL,
charisma int NOT NULL
);

drop table alignment;
CREATE table alignment (
alignment_id int auto_increment primary key,
name VARCHAR(50),
description VARCHAR (250)
);

insert into alignment (name, description) VALUES ('Lawful Good', 'Lawful good you can be combine both honor and compassion.');
insert into alignment (name, description) VALUES ('Neutral Good', 'Neutral good means doing what is good without bias for or against order.');
insert into alignment (name, description) VALUES ('Chaotic Good', 'Chaotic good you combine a good heart with a free spirit.');
insert into alignment (name, description) VALUES ('Lawful Neutral', 'Lawful neutral you are reliable and honorable without being a zealot.');
insert into alignment (name, description) VALUES ('True Neutral', 'Neutral means you act naturally, without prejudice or compulsion.');
insert into alignment (name, description) VALUES ('Chaotic Neutral', 'Chaotic neutral represents true freedom from both society restrictions and a do-gooder zeal.');
insert into alignment (name, description) VALUES ('Lawful Evil', 'Lawful evil is sometimes called "diabolical," because devils are the epitome of lawful evil.');
insert into alignment (name, description) VALUES ('Neutral Evil', 'Neutral evil beings consider their alignment to be the best because they can advance themselves without regard for others.');
insert into alignment (name, description) VALUES ('Chaotic Evil', 'Chaotic evil is sometimes called "demonic" because demons are the epitome of chaotic evil.');

select * from alignment;

drop table armor;
Create table armor (
armor_id int auto_increment primary key,
type VARCHAR(100),
name varchar(100),
class_number int, 
modifier VARCHAR(50),
weight int
);

insert into armor (type, name, class_number, modifier, weight) values ('Light Armor', 'Padded', '11', '+ Dex Modifier', '8');
insert into armor (type, name, class_number, modifier, weight) values ('Light Armor', 'Leather', '11', '+ Dex Modifier', '10');
insert into armor (type, name, class_number, modifier, weight) values ('Light Armor', 'Studded Leather', '12', '+ Dex Modifier', '13');
insert into armor (type, name, class_number, modifier, weight) values ('Medium Armor', 'Hide', '12', '+ Dex Modifier (max 2)', '12');
insert into armor (type, name, class_number, modifier, weight) values ('Medium Armor', 'Chain Shirt', '13', '+ Dex Modifier (max 2)', '20');
insert into armor (type, name, class_number, modifier, weight) values ('Medium Armor', 'Scale Mail', '14', '+ Dex Modifier (max 2)', '45');
insert into armor (type, name, class_number, modifier, weight) values ('Heavey Armor', 'Chain Mail', '16', 'Null', '55');

select * from armor;

drop table weapons;
CREATE TABLE weapons (
weapon_id int auto_increment primary key,
type VARCHAR (100), 
name VARCHAR(100),
damage VARCHAR (250),
weight int
);

insert into weapons (type, name, damage, weight) values ('Simple Weapon', 'Greatclub', '1d8 bludgeoning damage', 10);
insert into weapons (type, name, damage, weight) values ('Simple Weapon', 'Handaxe', '1d6 slashing damage', 2);
insert into weapons (type, name, damage, weight) values ('Simple Weapon', 'Mace', '1d6 bludgeoning damage', 4);
insert into weapons (type, name, damage, weight) values ('Martial Weapon', 'Battleaxe', '1d8 slashing damage', 4);
insert into weapons (type, name, damage, weight) values ('Martial Weapon', 'Greataxe', '1d12 slashing damage', 7);
insert into weapons (type, name, damage, weight) values ('Martial Weapon', 'Morning Star', '1d8 piercing damage', 4);
insert into weapons (type, name, damage, weight) values ('Martial Weapon', 'Longsword', '1d8 slashing damage', 3);
 
 


CREATE table alignment_player (
id int auto_increment primary key,
player_id int,
alignment_id int
);


Drop Table players;
CREATE TABLE players (
player_id int auto_increment primary key,
creature_id int,
race_id int,
stats_id int,
armor_id int,
weapon_id int, 
alignment_id int, 
player_name VARCHAR(250) NOT NULL,
character_name VARCHAR (100) NOT NULL,
FOREIGN KEY (alignment_id) references alignment (alignment_id) 
);

select * from players;

drop table player_stats;
CREATE table player_stats(
id int auto_increment primary key,
player_id int NOT NULL,
stats_id int NOT NULL
);

select * from weapons;
select * from players;
select * from armor;
insert into players (creature_id, race_id, armor_id, weapon_id, alignment_id, player_name, character_name) VALUES ('1', '2', '3', '5', '8', 'Catherine Wilber', 'Cortana');

select * from player;
select * from player;
select * from armor;
select * from weapon;
select * from player;
select * from class;

select * from races;
dROP TABLE PLAYER;

select * from alignment;

