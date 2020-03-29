package com.company;

  public class MercedesSl280 extends Car  {

     private int volume;
     private color color;
     private int release;

      public MercedesSl280(int volume, com.company.color color, int release) {
          this.volume = volume;
          this.color = color;
          this.release = release;
      }

      public int getVolume() {
          return volume;
      }

      public com.company.color getColor() {
          return color;
      }

      public int getRelease() {
          return release;
      }
  }
