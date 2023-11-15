package com.devmec.dslist.repositories;

import com.devmec.dslist.entities.Game;
import com.devmec.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
