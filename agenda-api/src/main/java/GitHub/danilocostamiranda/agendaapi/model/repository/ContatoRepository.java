package GitHub.danilocostamiranda.agendaapi.model.repository;

import GitHub.danilocostamiranda.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
