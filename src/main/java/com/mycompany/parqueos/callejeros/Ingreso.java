package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.time.LocalDateTime;


//==================== Clase ==================== \\.

/**
 *
 * @author keylor
 */

class Ingreso {
    private LocalDateTime fecha;
    private int monto;
    private int numeroEspacio;

    // Constructor, getters y setters
    
    public Ingreso(LocalDateTime fecha,int monto, int numeroEspacio ){
        this.fecha = fecha;
        this.monto = monto;
        this.numeroEspacio = numeroEspacio;
    }
}
