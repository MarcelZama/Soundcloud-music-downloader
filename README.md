## SoundCloud Music Downloader Documentation

### Overview

This project allows users to download music from SoundCloud by extracting song titles from playlist or liked song elements and downloading them automatically. The process involves:

Copying the HTML element containing the song list from SoundCloud's inspect mode.

Pasting the copied content into input.txt.

Running SongExtractor.java to extract song titles into songs.txt.

Running downloader.py to download the listed songs as audio files.

### Requirements

Java Setup

Install Java Development Kit (JDK)

Add Java to your system's PATH for easy execution

Python Setup

Install Python (3.x recommended)

Install required libraries using pip:

pip install yt-dlp

Ensure ffmpeg is installed for audio conversion. You can install it via:
"https://www.youtube.com/watch?v=JR36oH35Fgg" 

Windows: Download from ffmpeg.org and add it to PATH.

Linux: Install via package manager (e.g., sudo apt install ffmpeg).

### File Structure

├── Songs
├── Downloader.py
├── SongExtractor.java
├── input.txt
├── songs.txt
├── songstest.txt

Step 1: Extract Song Data from SoundCloud

Open your SoundCloud playlist or liked songs.

Right-click on the song list and select Inspect (or press Ctrl + Shift + I).

Locate the HTML element that contains the song list (typically a <div> or <ul> structure).

Copy the entire HTML element and paste it into input.txt.

Step 2: Extract Song Titles

Open a command prompt or terminal.

Navigate to the folder containing your project files.

Run the following command to execute SongExtractor.java:

javac SongExtractor.java
java SongExtractor

This will generate a songs.txt file containing the extracted song titles.

Step 3: Test the Downloader

Before downloading all the songs, test a small sample:

Copy a few titles from songs.txt into songstest.txt.

Open Downloader.py and change the song list file path to songstest.txt:

download_songs('----------------------\\songstest.txt')

Run the downloader:

python Downloader.py

Confirm that the songs download correctly.

Step 4: Download Full Playlist

Once you've verified that the downloader works:

Change the file path in Downloader.py back to songs.txt.

Run the downloader again to download the complete playlist:

python Downloader.py

Notes and Recommendations

Always test with songstest.txt first to avoid wasting time with incorrect entries.


### Disclaimer

This tool is intended for personal use only. Please ensure you comply with SoundCloud's terms of service when using this project.

