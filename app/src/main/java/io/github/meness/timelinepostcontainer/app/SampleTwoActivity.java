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
import android.support.v7.widget.LinearLayoutManager;

import com.mikepenz.fastadapter.adapters.FastItemAdapter;

import io.github.meness.timelinepostcontainer.InitClass;
import io.github.meness.timelinepostcontainer.RecyclerPauseOnScrollListener;
import io.github.meness.timelinepostcontainer.app.databinding.SampleTwoBinding;

public class SampleTwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SampleTwoBinding binding = DataBindingUtil.setContentView(this,R.layout.sample_two);

        FastItemAdapter<SampleItem> adapter = new FastItemAdapter<>();

        SampleItem item = new SampleItem();
        for (int i = 0; i < 10; i++) {
            adapter.add(item.setThumbnail("https://placeholdit.imgix.net/~text?txtsize=33&txt=350%C3%97150&w=600&h=600").setVideoPath("http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_2mb.mp4"));
        }

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.addOnScrollListener(new RecyclerPauseOnScrollListener(InitClass.imageLoader(this), false, true));
        binding.recyclerView.setAdapter(adapter);
    }
}
