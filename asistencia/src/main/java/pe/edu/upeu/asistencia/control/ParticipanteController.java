package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxcarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxtipoparticipante;

    @FXML
    public void initialize(){
        cbxcarrera.getItems().addAll(Carrera.values());
        cbxtipoparticipante.getItems().addAll(TipoParticipante.values());

    }
}
