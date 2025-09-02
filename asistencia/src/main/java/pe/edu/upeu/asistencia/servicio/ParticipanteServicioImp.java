package pe.edu.upeu.asistencia.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.repositorio.ParticipanteRepository;

import java.util.List;

@Service
public class ParticipanteServicioImp extends ParticipanteRepository implements ParticipanteServicioI {


    @Override
    public void save(Participante participante) {
        participantes.add(participante);

    }


    @Override
    public List<Participante> listar() {
        if(participantes.size()==1){
            return super.listar();

        }
        return participantes;
    }

    @Override
    public Participante update(Participante participante, int index) {
        return null;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Participante findById(int id) {
        return null;
    }
}
