
package Modelos;

public class Contabilidad {
    private String concepto;
    private double monto;

    // Constructor

    /**
     * Constructor de la clase Contabilidad.
     * @param concepto El concepto del registro contable.
     * @param monto El monto asociado al registro contable.
     */
    public Contabilidad(String concepto, double monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    // Getters y setters
    
    /**
     * Obtiene el concepto del registro contable.
     * @return El concepto del registro contable.
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Establece el concepto del registro contable.
     * @param concepto El nuevo concepto del registro contable.
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * Obtiene el monto asociado al registro contable.
     * @return El monto asociado al registro contable.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Establece el monto asociado al registro contable.
     * @param monto El nuevo monto asociado al registro contable.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
