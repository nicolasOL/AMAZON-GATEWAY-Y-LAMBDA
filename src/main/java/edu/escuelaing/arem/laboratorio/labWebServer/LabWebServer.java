/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package edu.escuelaing.arem.laboratorio.labWebServer;
import com.google.gson.Gson;
import edu.escuelaing.arem.laboratorio.model.Answer;
import edu.escuelaing.arem.laboratorio.model.Operation;
import static spark.Spark.*;
/**
 *
 * @author Nicolás
 */
public class LabWebServer {
    public static void main(String... args){
        port(getPort());
        get("/convert", (req,res) -> {
            /*
            BadAnswer badAns =new BadAnswer();
            badAns.setBadAnswer("El valor debe estar entre 1 y -1");
            */
            String respu = null;

            Double par= Double.parseDouble(req.queryMap().get("value").value());
            Double resp= convert(par);
            Answer ans =new Answer();
            ans.setOperation(Operation.convert.name());
            ans.setInput(par);
            ans.setOutput(resp);
            System.out.println(resp);
            respu = new Gson().toJson(ans);        
            return respu;
        });
    }
    /** Permite retornar el puerto que por defecto asigna el entorno.
     * @return el puerto asignado por el entorno.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    /** Permite retornar los grados convertidos a celsius
     * @return el puerto asignado por el entorno.
     */
    private static Double convert(Double par){
        return (par-32)/1.8;
    }

}
