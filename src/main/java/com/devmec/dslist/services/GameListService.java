package com.devmec.dslist.services;

import com.devmec.dslist.dto.GameDTO;
import com.devmec.dslist.dto.GameListDTO;
import com.devmec.dslist.dto.GameMinDTO;
import com.devmec.dslist.entities.Game;
import com.devmec.dslist.entities.GameList;
import com.devmec.dslist.repositories.GameListRepository;
import com.devmec.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
      List<GameList> result = gameListRepository.findAll();
      return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
