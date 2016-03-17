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

package com.github.alirezaaa.timelinepostcontainer.options;

import com.github.alirezaaa.timelinepostcontainer.interfaces.IImageClickListener;
import com.github.alirezaaa.timelinepostcontainer.interfaces.IImageLoadingListener;
import com.github.alirezaaa.timelinepostcontainer.interfaces.IListener;
import com.github.alirezaaa.timelinepostcontainer.interfaces.ITapListener;

public class Listeners {
    public IImageClickListener imageClickListener;
    public ITapListener tapListener;
    public IListener listener;
    public IImageLoadingListener imageLoadingListener;
}