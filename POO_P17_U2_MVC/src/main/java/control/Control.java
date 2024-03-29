package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

    public class Control implements ActionListener {
        
        private Vista view;
    private Modelo model;

    public Control(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("USTED VA A REALIZAR OPERACIONES POR MEDIO DE MVC");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResul.setText(String.valueOf(model.getTotal()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        model.setV2(Integer.valueOf(view.txtN2.getText()));
        
        if (e.getSource() == view.btnSumar) {
            model.sumar();
        } else if (e.getSource() == view.btnRestar) {
            model.restar();
        } else if (e.getSource() == view.btnMultiplicar) {
            model.multiplicar();
        } else if (e.getSource() == view.btnDividir) {
            model.dividir();
        }
        
        view.txtResul.setText(String.valueOf(model.getTotal()));   
    }
}

    
    
    

