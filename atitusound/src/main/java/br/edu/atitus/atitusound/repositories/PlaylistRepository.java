package br.edu.atitus.atitusound.repositories;

import br.edu.atitus.atitusound.entities.PlaylistEntity;
import br.edu.atitus.atitusound.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PlaylistRepository extends GenericRepository<PlaylistEntity>{

    Page<List<PlaylistEntity>> findByNameContainingIgnoreCaseAndUserOrPublicshare(String name, UserEntity user,
                                                                                  boolean publicshare, Pageable pageable);

}
