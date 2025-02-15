import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Dad {
    private Son son;

    public Dad(Son son) {this.son = son;}

    public void printSonName(){
        System.out.println("Hello! My son's name is " + son.getName());
    }
}