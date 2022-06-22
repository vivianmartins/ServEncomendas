package com.example.webapp;

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

        @GetMapping("listar")
            public String listar (Model model){
            List<Pratos> listEnc = PratoBLL.readAll(true);
           // for( Pratos     pr : listEnc)

            model.addAttribute("listEnc", listEnc);

            return   "listar";
        }
        @GetMapping("/")
        public String ViewHomePage(Model model){
            List<Pratos> listEnc = PratoBLL.readAll(true);
            for( Pratos en : listEnc)

                model.addAttribute("Nome", listEnc);

            return   "login";
        }

}
