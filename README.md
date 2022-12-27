# Hello! this is a public VALORANT RESTful API 
For its consumption the following calls were created:
- GET `api/valorant/all` for All the data
- GET `api/valorant/name/{name}` to get data by name
- GET `api/valorantrole/{role}` to get data by role

## MySQL database is used
>[schema-character](valorant_api_valorant_character.sql) |
>[schema-abilities](valorant_api_valorant_abilities.sql) |
>[schema-images](valorant_api_valorant_images.sql)

## Example

```js
...
{
    "codeResponse": "200",
    "characterDato": {
        "abilities": [
            {
                "ability_name": "Fast lane",
                "keyboard": "C",
                "description": "FIRE two energy lines forward on the ground that extend a short distance or until they hit a surface. The lines rise into walls of static electricity that block vision and damage enemies passing through them.",
                "id_character": 2,
                "id": 6
            },
            {
                "ability_name": "Relay bolt",
                "keyboard": "Q",
                "description": "INSTANTLY throw an energy bolt that bounces once. Upon hitting each surface, the bolt electrifies the ground below with a concussive blast.",
                "id_character": 2,
                "id": 7
            },
            {
                "ability_name": "High gear",
                "keyboard": "E",
                "description": "INSTANTLY channel Neon’s power for increased speed. When charged, ALT FIRE to trigger an electric slide. Slide charge resets every two kills.",
                "id_character": 2,
                "id": 8
            },
            {
                "ability_name": "Overdrive",
                "keyboard": "X",
                "description": "Unleash Neon’s full power and speed for a short duration. FIRE to channel the power into a deadly lightning beam with high movement accuracy. The duration resets on each kill.",
                "id_character": 2,
                "id": 9
            }
        ],
        "images": [
            {
                "role_image": "/valorant-api-rest/src/main/resources/images/DUELIST.png",
                "id": 2,
                "character_image": "/valorant-api-rest/src/main/resources/images/NEON.png"
            }
        ],
        "role": "Duelist",
        "origin": "Philippines",
        "name": "Neon",
        "id": 2,
        "biography": "Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning."
    },
    "message": "The data were processed"
}
...
```
