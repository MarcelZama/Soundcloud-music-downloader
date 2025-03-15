import os
import yt_dlp

def download_songs(song_list_file):
    download_path = 'Where-Downloaded-Songs-Go-To/Songs'

    if not os.path.exists(download_path):
        os.makedirs(download_path)

    with open(song_list_file, 'r', encoding='utf-8') as file:
        songs = [song.strip() for song in file.readlines()]

    for song_name in songs:
        print(f"Searching and downloading: {song_name}")
        
        ydl_opts = {
            'format': 'bestaudio[ext=m4a]/bestaudio/best',
            'outtmpl': f'{download_path}/{song_name}.%(ext)s',  # Correct download path
            'postprocessors': [{
                'key': 'FFmpegExtractAudio',
                'preferredcodec': 'mp3',
                'preferredquality': '192',
            }],
            'overwrites': True,
            'quiet': False,
        }

        with yt_dlp.YoutubeDL(ydl_opts) as ydl:
            try:
                ydl.download([f"ytsearch:{song_name}"])
                print(f"Downloaded: {song_name}")
            except Exception as e:
                print(f"Error downloading {song_name}: {e}")

download_songs('Where-Your-Song-List-Input-File-Is-\\songstest.txt')
