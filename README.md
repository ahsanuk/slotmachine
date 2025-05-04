<div id="top"></div>
<!--
*** Thanks for checking out the SlotMachine. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/ahsanuk/slotmachine/">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h1 align="center">Slot Machine</h1>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    
   <li><a href="#license">License</a></li>
 
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

A simple Java program to emulate a slot machine ( Read more, click <a href="http://en.wikipedia.org/wiki/Slot_machine"> here </a>). Slot machine, byname one-armed bandit, also known as a fruit machine, gambling device operated by dropping one or more coins or tokens into a slot and pulling a handle or pushing a button to activate one to three or more reels marked into horizontal segments by varying symbols.

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With


* [JAVA](https://java.com)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
# Getting Started

Follow the instructions below to get started. This game will be run locally on your device.

### Prerequisites

What is required to play the game on your device.

* Java SE Development Kit
  ```sh
  https://www.oracle.com/java/technologies/downloads/
  ```

### Installation

Once you have downloaded the Java SE Development Kit Follow the link below setup your Java SE Development Kit for macOS or Windows OS.
  ```sh
  https://gist.github.com/mohanpedala/700910ee504ed7f12bdf0249ca7d11e2
  ```
<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

The game will use the numbers 1-7 to represent the outputs on the wheels. The game should start with 10 credits for each player, and each time they log in it will use 1 credit. If a player wins, the amount of prize credits should be added to their stack.

<li>If the user selects to display credits, the program should show remaining credits and print the above menu again.</li>

<li>If the user selects to play game, the program should play one spin of the fruit machine and update the credits based on result.</li>

<li>If the user selects to exit game, the program should show remaining credits and then end the program.</li>

<li>If the user uses all of their credits a game over message should be displayed.</li>

</ul>
</br>

| Matches | Credits |
| --------------- | --------------- |
| 7-7-7           | 150 |
| 3 matching numbers (not 7-7-7) | 80 | 
| 3 in a row sequential order (i.e. 1-2-3)  | 40 |
| 3 in a row non sequential order (i.e. 2-1-3) | 25  |
| 2 Matching even   | 10 |
| 2 Matching odd  | 5  |
| Any one 7 (i.e. X-7-X)  | 2   |

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch 
3. Commit your Changes
4. Push to the Branch
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the GNU GPLv3 License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/ahsanuk/slotmachine.svg?style=for-the-badge
[contributors-url]: https://github.com/ahsanuk/slotmachine/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/ahsanuk/slotmachine.svg?style=for-the-badge
[forks-url]: https://github.com/ahsanuk/slotmachine/network/members
[stars-shield]: https://img.shields.io/github/stars/ahsanuk/slotmachine.svg?style=for-the-badge
[stars-url]: https://github.com/ahsanuk/slotmachine/stargazers
[issues-shield]: https://img.shields.io/github/issues/ahsanuk/slotmachine.svg?style=for-the-badge
[issues-url]: https://github.com/ahsanuk/slotmachine/issues
[license-shield]: https://img.shields.io/github/license/ahsanuk/slotmachine.svg?style=for-the-badge
[license-url]: https://github.com/ahsanuk/slotmachine/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/ahsanuk
[product-screenshot]: images/screenshot.png

