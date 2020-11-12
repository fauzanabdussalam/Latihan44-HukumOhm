/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan44.hukumohm;

/**
 *
 * @author User
 */
public class Baterai 
{
    private float kuatArus, hambatan;
    
    public void Baterai()
    {
        System.out.println("Hukum Ohm");
    }
    
    public void Baterai(float kuatArus, float hambatan)
    {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus()
    {
        return kuatArus;
    }
    
    public float getHambatan()
    {
        return hambatan;
    }
    
    public float hitungTegangan()
    {
        return kuatArus * hambatan;
    }
}
