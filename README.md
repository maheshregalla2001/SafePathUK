# SafePath UK

A privacy-first Android app that lets UK students check the recorded crime history of any area before walking there, and save personal places behind their fingerprint.

Built for the CIS4034-N Mobile App Development ICA at Teesside University.

---

## What problem does it solve?

Every year thousands of students arrive in a UK city they have never lived in before. Middlesbrough is a good example. Students do not know which streets had recorded crime last month or which routes near the halls are quieter at night.

That information exists for free at `data.police.uk`, the UK Police open data service. The problem is that the official website is a map in a browser with tiny filters nobody wants to configure.

**SafePath UK unlocks that data in one tap.**

## Who is it for?

The main user is a first-year Teesside University student, likely new to Middlesbrough, often an international student. The app has no ads, no account, no cloud sync. The user's saved places stay on their phone.

## What the app does today

The project is built in five one-week sprints. Sprints 1 and 2 are complete.

| Screen | What it shows |
|---|---|
| Splash | Blue brand splash for 1.5 seconds, then opens Home automatically. |
| Home | Welcome text, two buttons (Open Area detail, About this app), Info icon in the top bar for quick About access. |
| Area detail | Reached by tapping the primary Home button. Shows a placeholder today; live crime data from data.police.uk arrives in Sprint 4. |
| About | Three cards: Data source credit (data.police.uk), Open Government Licence v3.0 notice with a working outbound button, Permissions explanation. App version shown at the bottom. |

## Tech stack

| Layer | Choice |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose + Material 3 |
| Architecture | MVVM (ViewModel + StateFlow) |
| Navigation | androidx.navigation.compose |
| Build | Gradle Kotlin DSL |
| AGP | 9.2.1 |
| Kotlin | 2.2.10 |
| Minimum SDK | API 26 (Android 8.0) |
| Target SDK | API 36 (Android 16) |

Every library choice follows the course's own Recap-lecture stack so each design choice can be defended in the viva.

## Project structure

```
SafePathUK/
├── app/src/main/
│   ├── AndroidManifest.xml
│   ├── java/uk/ac/tees/mad/sxxxxxxxx/
│   │   ├── MainActivity.kt         single Activity, hosts Compose UI
│   │   ├── SafePathApp.kt          Application class (reserved for singletons)
│   │   ├── navigation/
│   │   │   ├── NavRoutes.kt        route name constants
│   │   │   └── SafePathNavHost.kt  NavHost with 4 routes
│   │   └── ui/
│   │       ├── theme/              Material 3 colours and typography
│   │       ├── splash/             SplashScreen.kt
│   │       ├── home/               HomeScreen.kt
│   │       ├── areadetail/         AreaDetailScreen.kt
│   │       └── about/              AboutScreen.kt
│   └── res/                        strings, themes, colours, launcher icons
├── build.gradle.kts                root build file
├── settings.gradle.kts
├── gradle/libs.versions.toml       dependency catalog
└── .gitignore
```

## How to build and run

1. Clone the repo:
   ```
   git clone https://github.com/maheshregalla2001/SafePathUK.git
   ```
2. Open the `SafePathUK` folder in Android Studio.
3. Wait for the first Gradle sync to finish (downloads AGP, Kotlin, Compose).
4. Pick an emulator (Medium Phone API 36.1 or Pixel 6 API 34 both work).
5. Click the green Run button.

Expected behaviour on first launch:
- Blue splash with shield icon for 1.5 seconds.
- Home screen with welcome text and two buttons.
- Both buttons navigate correctly. Back works everywhere.

## Sprint progress

| Sprint | Dates | Status | What it adds |
|---|---|---|---|
| 1 | 9 to 15 Nov 2026 | Done | Scaffolding, splash, navigation skeleton |
| 2 | 16 to 22 Nov 2026 | Done | About screen with OGL v3.0, Home top bar Info icon, orientation |
| 3 | 23 to 29 Nov 2026 | Planned | Room database, GPS, fingerprint lock, save and delete places |
| 4 | 30 Nov to 6 Dec 2026 | Planned | Retrofit, live data.police.uk crimes, postcode lookup, offline cache |
| 5 | 7 to 13 Dec 2026 | Planned | Canvas bar chart of crime types, security audit, polish |

Each sprint ships with a filled-in Sprint Plan document in the `Documentation/` folder of the main project workspace (not in this repo).

## Data source and licence

Crime records come from `data.police.uk`. The data is licensed under the Open Government Licence v3.0. The About screen in the app credits this and links to the licence.

> Contains public sector information licensed under the Open Government Licence v3.0.

Full licence text: https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/

## Author

Mahesh (student number S3654526)
CIS4034-N Mobile App Development, Teesside University
Tutor: Julien Cordry

## Repository

- Branches: `main` (releases), `develop` (next sprint work)
- Tags: `sprint-1`, `sprint-2`
- Commits reference their user story IDs (US-001, US-002, US-010, etc.)
