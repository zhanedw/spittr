package ca.statcan.zhanedw.spittr.data;

import ca.statcan.zhanedw.spittr.Spittle;

import java.util.List;

/**
 * Interface to retrieve spittles
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittleId);
}
