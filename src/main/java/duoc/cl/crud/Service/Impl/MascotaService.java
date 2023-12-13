/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duoc.cl.crud.Service.Impl;

import duoc.cl.crud.DTO.MascotaDTO;
import duoc.cl.crud.Service.IMascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zhnz
 */
public class MascotaService implements IMascota{
    
    public List<MascotaDTO> listaMascota = new ArrayList<>();

    @Override
    public void guardar(MascotaDTO m) {
        this.listaMascota.add(m);
    }

    @Override
    public List<MascotaDTO> listar() {
        System.out.println(this.listaMascota);
        return this.listaMascota;
    }   
    
  @Override
    public void eliminar() {
    }
}
