/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaime
 */
public class SucursalBancaria {
    private int idSucursalBancaria;
    private String entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    private List <CuentaBancaria> listaCuentas = new ArrayList<>();

    public SucursalBancaria(int idSucursalBancaria, String entidadBancaria, String codigoSucursal, String nombre) {
        this.idSucursalBancaria = idSucursalBancaria;
        this.entidadBancaria = entidadBancaria;
        this.codigoSucursal = codigoSucursal;
        this.nombre = nombre;
    }

    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    
}
