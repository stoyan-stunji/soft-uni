#ifndef SUM_AGR
#define SUM_AGR

#include "Aggregator.h"

class SumAggregator : public StreamAggregator
{
    public:
        SumAggregator(std::istream& stream) : StreamAggregator(stream)
        {
            this->aggregationResult = 0;
        }

        virtual void aggregate(int next)
        {
            this->aggregationResult += next;
            StreamAggregator::aggregate(next);
        }

};

#endif