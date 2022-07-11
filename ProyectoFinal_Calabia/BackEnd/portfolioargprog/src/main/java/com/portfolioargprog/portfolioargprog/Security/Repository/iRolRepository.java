
package com.portfolioargprog.portfolioargprog.Security.Repository;

import com.portfolioargprog.portfolioargprog.Security.Entity.Rol;
import com.portfolioargprog.portfolioargprog.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre); 
    
}
