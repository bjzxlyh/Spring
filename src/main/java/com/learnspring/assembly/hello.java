package com.learnspring.assembly;

public class hello {
  private  String str;

  public String getStr(){
      return str;
  }

    public void setStr(String str) {
        this.str = str;
    }



    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
