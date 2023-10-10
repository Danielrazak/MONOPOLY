package Main;

public class Penjara {

    private String[] option;
    private int numOfOption;

    public Penjara(int numOfOption) {
        this.numOfOption = numOfOption;
        option = new String[numOfOption];
        for(int i=0;i<numOfOption;i++){
            option[i]="";
        }
    }

    public void setOption(String optionName) {
        for (int i = 0; i <numOfOption;i++){
            if(option[i]==""||option[i]==null){
                option[i]=optionName;
                return;
            }
        }
    }
}
