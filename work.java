public class work {
    Scanner in = new Scanner(System.in);
    int x;//读进来的数字
    int[] numbers = new int[10];//读进来多少次，number[9]表示9出现了几次
    x =in.nextInt();
		while(x !=-1)//读第一个x进来
    {
        if( x>=0 && x<=9)
        {
            numbers[x] ++;
        }
        x=in.nextInt();//读入下一个x
    }
		for ( int x=0;x<numbers.length;x++)//便利，0-numbers.length
    {
        System.out.println(i+":"+numbers[x]);//i这个东西出现了numbers[i]次
    }

}

}
        }
