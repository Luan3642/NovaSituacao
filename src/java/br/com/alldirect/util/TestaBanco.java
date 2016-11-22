/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.util;

import br.com.alldirect.dao.IngressoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class TestaBanco {
    public static void main(String[] args){
        try {
            IngressoDao ingressoDao = new IngressoDao();
            System.out.println(ingressoDao.recuperaIdIngresso());
            
        } catch (SQLException ex) {
            Logger.getLogger(TestaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
