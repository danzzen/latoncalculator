# latoncalculator
<h3>How to Use</h3>
<p>To get a Git project into your build:</p>
<b>Step 1.</b> Add the JitPack repository to your build file<br/>
Add it in your root build.gradle at the end of repositories:

```

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```

<b>Step 2.</b> Add the dependency

```

	dependencies {
	        compile 'com.github.danzzen:latoncalculator:v1.0'
	}

```

<h5>Example</h5>
<p>define points using pointclass constructor</p>

```

 Point buenosAiresObeliscoPoint =
                new Point((float) -34.6037389, (float) -58.3815704);

        Point nycStatueOfLibertyPoint =
                new Point((float) 40.6892494, (float) -74.0445004);
     
```
<p>calculate distance by calling function by class name <b>note no neeed of instance because class and methods are static</b></p>

```

  float distanceBetweenPoints = LatlonDistance.calculateDistance(
                buenosAiresObeliscoPoint,
                nycStatueOfLibertyPoint);

```


