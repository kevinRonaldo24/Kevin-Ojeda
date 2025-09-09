package pe.edu.upeu.asistencia.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.servicio.ParticipanteServicioI;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxcarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxtipoparticipante;

    @FXML
    TableView<Participante> tableView;
    ObservableList<Participante> participantes;
    TableColumn<Participante, Integer> dniCol, nombreCol, apellidoCol, carreraCol, tipoPartCol;

    @Autowired
    ParticipanteServicioI ps;


    @FXML
    public void initialize(){
        cbxcarrera.getItems().addAll(Carrera.values());
        cbxtipoparticipante.getItems().addAll(TipoParticipante.values());
        definirNombresCOLUMNAS();
        listarParticipantes();

    }


    public void definirNombresCOLUMNAS(){
        dniCol = new TableColumn("DNI");
        nombreCol = new TableColumn("NOMBRE");
        apellidoCol = new TableColumn("Apellido");
        apellidoCol.setMinWidth(200);
        carreraCol = new TableColumn("Carrera");
        tipoPartCol = new TableColumn("Tipo Participante");
        tipoPartCol.setMinWidth(160);
        tableView.getColumns().addAll(dniCol, nombreCol, apellidoCol, carreraCol, tipoPartCol);
    }

    public void listarParticipantes(){
        dniCol.setCellValueFactory(cellData ->
              cellData.getValue().getDni());
        participantes=FXCollections.observableArrayList(ps.findAll());
        tableView.setItems(participantes);
    }

}
