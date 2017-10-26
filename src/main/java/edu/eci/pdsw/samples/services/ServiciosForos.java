package edu.eci.pdsw.samples.services;


import java.sql.Date;
import java.util.List;
import java.util.Set;
import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.entities.EntradaForo;

/**
 *
 * @author 2106913
 */
public interface ServiciosForos {

    /**
     * Consultar todas las entradas de foro
     * @return
     * @throws ExcepcionServiciosSuscripciones 
     */
    public List<EntradaForo> consultarForos() throws ExcepcionServiciosSuscripciones;
        
    
    /**
     * Consulta una entrada de foro a partir de su identificador
     * @param id el identificador del foro
     * @return La entrada de foro con sus comentarios ordenados del mas
     * reciente al mas antiguo
     * @throws ExcepcionServiciosSuscripciones si NO existe un foro con dicho
     * identificador, o si se presenta otro problema en las capas inferiores.
     */
    public EntradaForo consultarForosPorId(int id) throws ExcepcionServiciosSuscripciones;
    
    /**
     * Consulta una entrada de foro a partir de su identificador
     * @return el listado de entrada de foros que tengan comentarios con vulgaridades,
     * es decir, cuyos comentarios contengan en su texto las palabras 'recorcholis' y
     * 'carambolas'
     * @throws ExcepcionServiciosSuscripciones si se presenta otro problema en las capas inferiores.
     */
    public List<EntradaForo> consultarForosConVulgaridades() throws ExcepcionServiciosSuscripciones;
    

}
