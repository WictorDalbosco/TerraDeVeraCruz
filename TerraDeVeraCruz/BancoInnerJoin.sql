-- 1. Informe todos os Npcs cadastrados no jogo
SELECT * from Npc;

-- 2. Quantas armas existem no inventário 1
SELECT S.idInvent, count(Item.id) as Armas from Slot S
    inner join Item 
		on S.cod=Item.cod
        where Item.id like '1%'
        and S.idInvent=1
	GROUP BY S.idInvent;

-- 3. Qual(is) arma(s) o jogador tem
SELECT P.nome,S.idInvent, It.nome as Armas from personagem P inner join slot S
	on P.save=S.save
		inner join Item It
			on S.cod=It.cod
			where It.id like '1%'
			and S.idInvent=1;

-- 4. Informe os dados do jogador
SELECT * from Personagem;

-- 5. Quanto custa o inventário de Bernardo
SELECT N.nomeNpc,S.idInvent, sum(It.id) as Total from npc N inner join slot S
	on N.idNpc=S.idNpc
		inner join Item It
			on S.cod=It.cod
            where N.nomeNpc="Bernardo"
            GROUP BY S.idInvent;

-- 6. Qual a força das armas de Kaiowa
SELECT N.nomeNpc,It.nome, sum(Ita.forca) as Forca from npc N inner join slot S
	on N.idNpc=S.idNpc
	inner join Item It
		on S.cod=It.cod
		inner join itemarmas Ita
			on It.id=Ita.id
		where N.nomeNpc="Kaiowa"
        GROUP BY Ita.id;

-- 7. De qual material é feita a lança
SELECT It.nome,Ita.materialArmas as Material from Item It inner join itemarmas Ita
	on It.id=Ita.id
    where It.nome="Lança";

-- 8. Informe as habilidades cadastradas
SELECT * from Habilidade;

    
-- 9. Quais habilidades o jogador tem
SELECT P.nome,H.nomeHabil from Personagem P inner join habilidade H
	on P.save=H.save
    where P.nome="Vásquez de La Fonseca";
    
-- 10. Informe todos os itens cadastrados no jogo
SELECT * from Item;

-- 11. Quais items possuem alcool
SELECT It.nome from Item It inner join itemconsumivel Itc
	on It.id=Itc.id
    where Itc.alcool=1;
    
-- 12. Quais vestimentas o jogador tem
SELECT P.nome,s.idInvent, It.nome as Roupas from personagem P inner join Slot S
	on P.save=S.save
		inner join Item It
			on S.cod=It.cod
			where It.id like '2%'
			and S.idInvent=1;
            
-- 13. Qual npc tem um bacalhau no inventário
SELECT N.idNpc, N.nomeNpc, It.nome from Slot S inner join Npc N
	on S.idNpc=N.idNpc
		inner join Item It
			on S.cod=It.cod
            where It.nome like 'bacalhau';

-- 14. Informe todas apenas as armas cadastradas
SELECT * from ItemArmas;
            
-- 15. Quem tem o inventário mais caro
SELECT N.nomeNpc,S.idInvent, sum(It.valorCompra) as $Total from Npc N inner join Slot S
	on N.idNpc=S.idNpc
		inner join Item It
			on S.cod=It.cod
            GROUP BY S.idInvent
            ORDER BY sum(It.valorCompra) desc;

-- 16. Informe apenas as vestimentas cadastradas
SELECT * from ItemVestimenta;

-- 17. Informe apenas os itens começados com a letra A
SELECT * from Item
	where nome like 'a%';

-- 18. Informe apenas os Npcs hostis
SELECT * from Npc
	where tipo like 'hostil';

-- 19. Informe os itens com preço de compra maior ou igual a 100
SELECT nome,valorCompra from Item
	where valorCompra=100 or valorCompra>100
    ORDER BY valorCompra desc;

-- 20. Informe apenas os consumíveis cadastrados
SELECT * from ItemConsumivel;
