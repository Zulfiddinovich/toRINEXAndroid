Location longitude and latitude data structure (demo) by Zukhriddin Kamolov
---------------------------------------------------------------

Use case:
```java
class MainActivity extends AppCompatPreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        LongLatLocation location = new LongLatLocation(1.0, 1.0);
        location.print();
    }
}
```
