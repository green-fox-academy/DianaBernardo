package com.greenfoxacademy.springstart;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  long id;
  String content;
  static AtomicLong counter = new AtomicLong(1);

  public String[] getHellos() {
    return hellos;
  }

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] colors = {"Yellow", "Red", "Blue", "Green", "Black", "Deeppink", "Gold", "Mocassin", "Indigo"};

  public String randomHello() {
    int index = (int)(Math.random()*50);
    return hellos[index];
  }

  public int randomSize() {
    int size = (int)(Math.random()*50);
    return size;
  }

  public String colorRandom() {
    int index = (int)(Math.random()*8);
    return colors[index];
  }


  public Greeting(String content) {
    this.id = counter.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
