package uk.ac.tees.mad.sxxxxxxxx.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uk.ac.tees.mad.sxxxxxxxx.ui.about.AboutScreen
import uk.ac.tees.mad.sxxxxxxxx.ui.areadetail.AreaDetailScreen
import uk.ac.tees.mad.sxxxxxxxx.ui.home.HomeScreen
import uk.ac.tees.mad.sxxxxxxxx.ui.splash.SplashScreen

// Sprint 1: NavHost with the four placeholder routes required by the Sprint 1 plan.
// Each route navigates correctly; later sprints flesh out the screen bodies.
@Composable
fun SafePathNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavRoutes.SPLASH) {

        composable(NavRoutes.SPLASH) {
            SplashScreen(onNavigateHome = {
                navController.navigate(NavRoutes.HOME) {
                    popUpTo(NavRoutes.SPLASH) { inclusive = true }
                }
            })
        }

        composable(NavRoutes.HOME) {
            HomeScreen(
                onOpenArea = { navController.navigate(NavRoutes.AREA_DETAIL) },
                onOpenAbout = { navController.navigate(NavRoutes.ABOUT) }
            )
        }

        composable(NavRoutes.AREA_DETAIL) {
            AreaDetailScreen(onBack = { navController.popBackStack() })
        }

        composable(NavRoutes.ABOUT) {
            AboutScreen(onBack = { navController.popBackStack() })
        }
    }
}
