# Android Project 3 - *FlixterPlus*

Submitted by: **Stephen Ebrahim**

**FlixterPlus** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **5** hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [X] **Parse through JSON data and implement a RecyclerView to display all movies**
- [X] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [X] Improve and customize the user interface through styling and coloring
- [X] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [X] Implement Glide to display placeholder graphics during loading
  - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![Kapture 2023-02-10 at 10 26 14](https://user-images.githubusercontent.com/66531257/218129834-83fcc072-4ab9-45e9-b055-9935404ea644.gif)

GIF created with [Kap](https://getkap.co/)

Additional screenshots of code to prove all required and optional features are indeed implemented (refer to source code if needed):

- Making a request to the Movie Database API's `now_playing` and parsing:
<img width="705" alt="Screenshot 2023-02-10 at 10 40 15 AM" src="https://user-images.githubusercontent.com/66531257/218132770-44fd8137-8235-4b4c-94c3-1b723305ec14.png">

- Using JSON Serialization:
<img width="412" alt="Screenshot 2023-02-10 at 10 40 56 AM" src="https://user-images.githubusercontent.com/66531257/218132929-fd884aba-d12c-4542-b29d-fb8268f7a4b4.png">

- Using glide to load and display movie poster image. Here I also use the `.placeholder()` method to insert the android logo for when the image is loading as said in the stretch feature:
<img width="800" alt="Screenshot 2023-02-10 at 10 42 29 AM" src="https://user-images.githubusercontent.com/66531257/218133301-e42d21b8-6aef-44ee-8eb8-f1f50440bc72.png">


## Notes

Describe any challenges encountered while building the app:

The biggest challenge encounted when developing the app was correctly making the api call with the correct parameter as well as parsing the json data fetched from making the api call.

## License

    Copyright [2023] [Stephen Ebrahim]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
