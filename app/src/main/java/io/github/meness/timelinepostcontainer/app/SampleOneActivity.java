/*
 * Copyright 2016 Alireza Eskandarpour Shoferi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.meness.timelinepostcontainer.app;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.meness.timelinepostcontainer.Type;
import io.github.meness.timelinepostcontainer.app.databinding.ItemBinding;

public class SampleOneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ItemBinding binding = DataBindingUtil.setContentView(this,R.layout.item);

        binding.timelinePostContainer.setImagePath("https://placeholdit.imgix.net/~text?txtsize=33&txt=350%C3%97150&w=600&h=600");
        binding.timelinePostContainer.setVideoPath("http://html5demos.com/assets/dizzy.mp4");
        binding.timelinePostContainer.build(Type.VIDEO);
    }
}
