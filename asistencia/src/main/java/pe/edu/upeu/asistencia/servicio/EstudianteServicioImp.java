package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Estudiante;
import pe.edu.upeu.asistencia.repositorio.EstudianteRepository;

import java.util.List;

public class EstudianteServicioImp extends EstudianteRepository implements EstudianteServicioI{


    @Override
    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);

    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    @Override
    public List<Estudiante> findAllEstudiantes() {
        if(estudiantes.size()==1){
            return super.findAllEstudiantes();

        }
        return estudiantes;
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante, int index) {
        return null;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Estudiante findEstudianteById(int id) {
        return null;
    }
}
