package task2;

public class Rainbow {



    static int index = 1;

    String[] rainbow = {"0", "Red", "Orange", "Yellow", "Green", "Blue", "Dark Blue", "Violet"};
/*
на самом деле не успел сделать полуцвета, очень поздно заканчивал.
вопрос в лучшем методе реализации, но если про простому то можно просто дописать их в массив
и добавить чисел, а пользователю объяснить это в условиях выбора
 */
    public String getRainbow () {
        if (index >= 1 && index <= 7) {
            return rainbow[index];
        } else {
            return("Input correct digit from 1 to 7");
        }
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public void setRainbow(String[] rainbow) {
        this.rainbow = rainbow;
    while (index != 0) {

        if (index >= 1 && index <= 7) {
            System.out.println (rainbow[index]);
        }else {
            System.out.println("Input correct digit from 1 to 7");
        }

        index ++;

    }


    }


}
