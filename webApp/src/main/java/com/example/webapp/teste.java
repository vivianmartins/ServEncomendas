package com.example.webapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.bd.BLL.EncomendaBLL;
import com.bd.BLL.PratoBLL;
import com.bd.DAL.Encomendas;
import com.bd.DAL.Estafeta;
import com.bd.DAL.Pratos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller


public class teste {
    /*
    @Autowired /* spring ejetar o DAO
    private Pratos pratos;
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
        @GetMapping("/")
        public String ViewHomePage(Model model){

            return   "login";
        }

}
