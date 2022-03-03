package mobile.android.parkingspotfinder.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import mobile.android.parkingspotfinder.domain.model.ParkingSpot
import mobile.android.parkingspotfinder.domain.repository.ParkingSpotRepository

class ParkingSpotRepositoryImpl(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun getParkingSpots(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpots().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}