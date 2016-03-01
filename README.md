# TimelinePostContainer

[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](http://developer.android.com/index.html)
[![Release](https://jitpack.io/v/alirezaaa/TimelinePostContainer.svg)](https://jitpack.io/#alirezaaa/TimelinePostContainer)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![License](https://img.shields.io/badge/License-Apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Timeline is a famous and user-friendly feature these days; If you need to implement one of them at the your next project, consider using this library. Tried to have simple methods, currently you just need to write three lines of codes!

## A Quick Overview What's In
* Compatible down to API Level 16
* Try loading images again if there's a problem with internet connection
* Native `VideoView`
* Listeners (double tap, image click)
* Two kinds of posts supported (only images and videos with a thumbnail)
* Indeterminate `ProgressBar` while loading
* Volley used for loading and caching images
* Plays only one video at a time
* Play and/or pause videos with a drawable
* Compatible with using inside `RecyclerView`
* Appropriate animations
* Good performance

## Include to Project
### Provide the Gradle Dependency
#### Step 1
Add the JitPack in your root `build.gradle` at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
#### Step 2
Add the dependency
```gradle
dependencies {
    compile 'com.github.alirezaaa:TimelinePostContainer:2.0'
}
```
### Clone or Download `.zip` file
Clone this repository or download the compressed file, then extract to your computer. Simply import the `library` module to your project.

## Usages
You just have to provide the `ImageLoader` and your desired image and/or video paths as I did below or simply compile and try the sample `app` provided:
```java
public class SampleActivity extends AppCompatActivity {

    @Bind(R.id.timelinePostContainer)
    TimelinePostContainer timelinePostContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_one);

        timelinePostContainer.setImageLoader(MyApplication.getInstance().getImageLoader());

        timelinePostContainer.setImagePath("image path");
        timelinePostContainer.setVideoPath("video path if you need the video implementation");
        timelinePostContainer.build(Type.VIDEO); //or Type.IMAGE if you need the image implementation
    }
}
```

## Apps Using the TimelinePostContainer
*feel free to send me new projects.*
- [Collect-Up](http://collect-up.com)

## Contributors
- [Alireza Eskandarpour Shoferi](https://twitter.com/enormoustheory) (developer)
- Farzad Nadiri (thanks to)

## License
    Copyright 2016 Alireza Eskandarpour Shoferi
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
