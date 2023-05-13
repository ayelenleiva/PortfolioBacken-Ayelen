
package com.portfolioo.ayelen.Security.Repository;

import com.portfolioo.ayelen.Security.Entity.Rol;
import com.portfolioo.ayelen.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
