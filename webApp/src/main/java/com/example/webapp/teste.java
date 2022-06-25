package com.example.webapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.bd.BLL.EncomendaBLL;
import com.bd.BLL.PratoBLL;
import javax.persistence.*;
import com.bd.DAL.Encomendas;
import com.bd.DAL.Estafeta;
import com.bd.DAL.Pratos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller


public class teste {
    /*
    @Autowired /* spring ejetar o DAO
    private Pratos pratos;
*/
/*
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
           public String listar (){
      //List <Pratos> listEnc = PratoBLL.readAll(true);
            //  List<Pratos> listEnc = new ArrayList<Pratos>();
            //listEnc.addAll(listEnc);
      //model.addAttribute("listEnc", listEnc);

            @ModelAttribute("SpringWeb") PModelMap model, HttpServletRequest request){
            List<Pratos> pratos = (List<Pratos>)
             request

            return   "listar";

        }

*/

/*
LISTAR PRATOS
 */

    @GetMapping("listar")
    public String listar (Model model){
        List <Pratos> pratosList= PratoBLL.readAll(true);
        //  List<Pratos> listEnc = new ArrayList<Pratos>();
        //listEnc.addAll(listEnc);
        // model.addAttribute("Pratos", pratosList);
        model.addAttribute("Pratos", PratoBLL.readAll(true));

        return   "listar";
    }


/*

    @GetMapping("Pratos" )
    public String ementa (Model model){
        //List <Pratos> listEnc = PratoBLL.readAll(true);
        //  List<Pratos> listEnc = new ArrayList<Pratos>();
        //listEnc.addAll(listEnc);
        //model.addAttribute("listEnc", listEnc);

        model.addAttribute("Pratos", PratoBLL.readAll(true));

        return   "Pratos";
    }
*/

    /***
     * HOME
     * @param model
     * @return
     */
        @GetMapping("/")
        public String ViewHomePage(Model model){

            return   "login";
        }

}
