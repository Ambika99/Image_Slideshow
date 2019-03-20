package ambika.android.com.image_slideshow;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    private String[] images ={
            "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiLmNKAkInhAhXClOYKHeSdAF8QjRx6BAgBEAU&url=https%3A%2F%2Fdepositphotos.com%2F81139896%2Fstock-illustration-online-shopping-banner.html&psig=AOvVaw1y1JYHv7k82VlFoVQnadLE&ust=1552910330776132",
            "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjw4sWQkInhAhXF7nMBHZypB18QjRx6BAgBEAU&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F824721750484964731%2F&psig=AOvVaw1y1JYHv7k82VlFoVQnadLE&ust=1552910330776132"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(MainActivity.this, images);
        viewPager.setAdapter(adapter);
    }
}
